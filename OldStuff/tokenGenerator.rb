def playMessages arrayOfMessage
  puts
  arrayOfMessage = Array arrayOfMessage 
  while !arrayOfMessage.empty?
    puts arrayOfMessage.shift
  end
  puts
end

def viewFile? filepath
  answer = STDIN.gets.chomp
  if answer.capitalize == "Y"
    system("vim " + filepath)
  end
  playMessages ["Let's move on."]
end

def displayError filepath
  playMessages(["Oops. The file: " + filepath + " already exists.", "Let's move on."])
end

def createFileDeleteBackUp filepath, oldString, replacementString
  if (oldString.include?(" ") || replacementString.include?(" ")) 
    text = File.read(filepath)
    replace = text.gsub(oldString, replacementString)
    File.open(filepath, "w") {|file| file.puts replace}
  else
    system('sed -i ".bak" "s/' + oldString + '/' + replacementString + '/g" ' + filepath)
    system("rm " + filepath + ".bak")
  end
end

def copyFile originalPath, newPath
  system("cp " + originalPath + " " + newPath)
end

#Introduction From Program
playMessages ["Hello, I am going to help you make some tokens for j--.","First, let's make some tests."]


# Create Passing Test
###########################

# Request Name for Passing Test
playMessages ["Okay, I will start by  making a file for your passing tests.","What would you like to name your passing and failing files?"]
requestedFileName =  STDIN.gets.chomp
fileNameForTests = "tests/pass/" + requestedFileName + ".java"

# If the files exists
if !File.exists? fileNameForTests

  # Create a new file using the Division Test File
  copyFile("tests/pass/Division.java ", fileNameForTests)
  # Replace the Class name of the file
  createFileDeleteBackUp(fileNameForTests, "Division", requestedFileName)

  # Alert the user that the file has been created. And request for method name
  messages = ["Created " + fileNameForTests, "", "Now I need to know what to put in this file.", "What type would you like your method to return for your passing test?"]
  playMessages(messages)
  requestedReturnType = STDIN.gets.chomp
  createFileDeleteBackUp(fileNameForTests, "int", requestedReturnType)

  messages = ["Okay, now please set the parameters for the method.", "Type in each parameter like so: Type param, Type2 param2"];
  playMessages(messages);
  requestedParameters = STDIN.gets.chomp
  createFileDeleteBackUp(fileNameForTests, requestedReturnType + " " + "x, " + requestedReturnType + " y", requestedParameters)

  messages = ["Okay, now what is the name of the method you would like tested?"]
  playMessages(messages)
  requestedMethodName = STDIN.gets.chomp

  # Replace the method name
  createFileDeleteBackUp(fileNameForTests, "divide", requestedMethodName)

  # Alert the user and ask for the contents of the method 
  messages = ["Done. Now what would you like to replace the contents of this method with?"]
  playMessages(messages)
  requestedContents = STDIN.gets.chomp

  # Change the contents of the method
  createFileDeleteBackUp(fileNameForTests, "return x / y;", requestedContents)

  # Alert the user
  messages = ["Done. Sweet, I've finished creating the pass test file for you.", "Would you like to open it up to review it? [Y,N]"]
  playMessages(messages)

  #Ask to view file
  viewFile?(fileNameForTests)
else
  messages = ["Oops. The file: " + fileNameForTests + " already exists.", "Let's move on."]
  playMessages messages
end
puts

# Create Failing Test File
########################
messages = ["I'm going to create your failing tests now."];
playMessages(messages)
fileNameForTests = "tests/fail/" + requestedFileName + ".java"

# If the files exists
if !File.exists? fileNameForTests

  # Create a new file using the Division Test File
  copyFile("tests/fail/Division.java ", fileNameForTests)
  # Replace the Class name of the file
  createFileDeleteBackUp(fileNameForTests, "Division", requestedFileName)

  # Alert the user that the file has been created. And request for method name
  messages = ["Created " + fileNameForTests + ".", "Now I need to know what to put in the main method of this file.", "What would you like to make as your fail test?"]
  playMessages(messages)
  requestedContents = STDIN.gets.chomp

  # Change the contents of the main method
  createFileDeleteBackUp(fileNameForTests, "System.out.println('a' / 42);", requestedContents)

  # Alert the user
  messages = ["Done. Sweet, I've finished creating the fail test file for you.", "Would you like to view the file we've created?"]
  playMessages(messages)

  viewFile?(fileNameForTests)
else
  displayError fileNameForTests
end


# Request to get token
#################################
messages = ["Okay, let's add the token to the TokenInfo.java file.", 'What is the kind of your token? Example: CHAR_LITERAL']
playMessages(messages)
requestedKind = STDIN.gets.chomp


playMessages ["What is the image of your token? Examples : <CHAR_LITERAL>, )"]
requestedImage = STDIN.gets.chomp

requestedToken = requestedKind + '("' + requestedImage + '")';

# Modify Token
replacementToken = 'CHAR_LITERAL("<CHAR_LITERAL>")'
newToken = replacementToken + ', ' + requestedToken
tokenFile = "src/jminusminus/TokenInfo.java"
if (File.exists? tokenFile)
  createFileDeleteBackUp(tokenFile, replacementToken, newToken)
  playMessages(["Sweet. I'm done with that.", "Would you like to open up the TokenInfo.java file to review my work?"])
  viewFile? tokenFile
  playMessages(["Let's move on."])
else
  displayError tokenFile
end

# ADDDING TEST TO TEST RUNNER
#############################################
testRunnerFile = "tests/junit/JMinusMinusTestRunner.java"
if File.exists? testRunnerFile
  newTestSuiteName = requestedFileName + "Test"
  createFileDeleteBackUp(testRunnerFile, "suite.addTestSuite(DivisionTest.class);", "suite.addTestSuite(DivisionTest.class);
        suite.addTestSuite(" + newTestSuiteName  + ".class);")
  playMessages(["I also just added your test to the JMinusMinusTestRunner.java file also.", "Would you like to review it?"])
  viewFile? testRunnerFile
else
  displayError testRunnerFile
end

# Adding Test File
testFileName = "tests/junit/" + requestedFileName + "Test.java"
if ( !File.exists?(testFileName) && File.exists?("tests/junit/DivisionTest.java"))
  copyFile("tests/junit/DivisionTest.java", "tests/junit/" + requestedFileName + "Test.java")
  createFileDeleteBackUp(testFileName, "Division", requestedFileName)
  createFileDeleteBackUp(testFileName, "Divide", requestedMethodName.capitalize!)
  createFileDeleteBackUp(testFileName, "division", requestedFileName.downcase + "X")
  createFileDeleteBackUp(testFileName, "divide", requestedMethodName)

  messages = ["I just created your test file.", "Would you like me to open up your file so you can edit it and add your test information?"]
  playMessages(messages)
  viewFile? testFileName
else
  displayError testFileName
end

playMessages(["Let's add to the lexical grammar file.", "First what kind of token are we working with here?", "\t[1] reserved word", "\t[2]operator", "\t[3]separator", "\t[4]identifier", "\t[5]literal"])

requestedGrammar = STDIN.gets.chomp;
while (requestedGrammar != "1" && requestedGrammar != "2" && requestedGrammar != "3" && requestedGrammar != "4" || requestedGrammar != "5")
  playMessages ["Sorry, I did not recognize that. Here are your options.", "\t[1] reserved word", "\t[2]operator", "\t[3]separator", "\t[4]identifier", "\t[5]literal"]
end

lexicalFile = "lexicalgrammar"
case requestedGrammar
when "1"
  createFileDeleteBackUp(lexicalFile, '"while"', '"while"
' + requestedKind + "       ::= " + '"' + requestedImage + '"')
  playMessages ["Your reserved word has been added to the lexicalgrammar file. Would you like to review your file?"]
  viewFile? lexicalFile
when "2"
  createFileDeleteBackUp(lexicalFile, '"/"', '"/"
' + requestedKind + "         ::= " + '"' + requestedImage + '"');
  playMessages ["Your operator has been added to the lexicalgrammar file. Would you like to review your file?"]
  viewFile? lexicalFile
when "3"
  createFileDeleteBackUp(lexicalFile, '";"', '";"
' + requestedKind + '        ::= ' + '"' + requestedImage + '"')
  playMessages ["Your separator word has been added to the lexicalgrammar file. Would you like to review your file?"]
  viewFile? lexicalFile
when "4" || "5"
  playMessages ["Since it is an identifier or literal, let's have you open the file and edit it"]
  viewFile? lexicalFile
end

scannerFile = "src/jminusminus/Scanner.java"
if (requestedGrammar == "1")
  createFileDeleteBackUp(scannerFile, "CONTINUE);", "CONTINUE);
        reserved.put(" + requestedKind + ".image(), " + requestedKind + ");")
  playMessages ["I've added your reserve word to the Scanner", "Would you like to review the file?"]
  viewFile? scannerFile
end