class CodeCompiler {
public static void main(String[] args) {
System.out.println("Hello Code Compiler System");

getCompilerInfo();

System.out.println("I have two code line counts, please add and display");

int javaLines = 120;
int pythonLines = 80;
boolean compileSuccess = true;

addCodeLines(javaLines, pythonLines, compileSuccess); // calling method

System.out.println("What is the compiler version");

float compilerVersion = getCompilerVersion();
System.out.println(compilerVersion);
}

static void getCompilerInfo() {
System.out.println("Compiler converts source code into machine code");
}

static void addCodeLines(int lines1, int lines2, boolean success) {
System.out.println("Calculating total code lines");
int totalLines = lines1 + lines2;
System.out.println(totalLines);
System.out.println("Compilation Success: " + success);
    }

static float getCompilerVersion() {
System.out.println("Please wait, checking compiler version");
float version = 17.0f;
System.out.println("Compiler version retrieved successfully");
return version;
}
},