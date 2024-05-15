package project;

import java.util.Scanner;
 class Patterns{

	 public String solidRectangle(int n, int m, int size) {
		    StringBuilder htmlOutput = new StringBuilder();
		    htmlOutput.append("<pre style=\"font-size: ").append(size).append("px;\">\nSolid Rectangle\n");
		    for (int i = 0; i < n; i++) {
		        for (int j = 0; j < m; j++) {
		            // Append the character '*' 'size' number of times horizontally
		    
		                htmlOutput.append(" * ");
		            
		        }
		        htmlOutput.append("\n");
		    }
		    htmlOutput.append("</pre>");
		    return htmlOutput.toString();
		}



	 public String hollowRectangle(int n, int m, int size) {
		    StringBuilder htmlOutput = new StringBuilder();
		    htmlOutput.append("<pre style=\"font-size:").append(size).append("px;\">\nHollow Rectangle\n");
		    
		    // Nested loops to iterate through rows and columns
		    for (int i = 0; i < n; i++) {
		        for (int j = 0; j < m; j++) {
		            // Condition to check if current position is on the border
		            if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
		                htmlOutput.append(" * ");
		            } else {
		                htmlOutput.append("    ");
		            }
		        }
		        // Move to the next line after each row is completed
		        htmlOutput.append("\n");
		    }
		    // Closing the HTML 'pre' tag
		    htmlOutput.append("</pre>");
		    return htmlOutput.toString();
		}


	 public String halfPyramid(int n, int size) {
		    StringBuilder htmlOutput = new StringBuilder();
		    htmlOutput.append("<pre style=\"font-size: ").append(size).append("px;\">\nHalf Pyramid\n");
		    
		    // Nested loops to iterate through rows and columns
		    for (int i = 1; i <= n; i++) {
		        for (int j = 1; j <= i; j++) {
		            htmlOutput.append(" * ");
		        }
		        // Move to the next line after each row is completed
		        htmlOutput.append("\n");
		    }
		    // Closing the HTML 'pre' tag
		    htmlOutput.append("</pre>");
		    return htmlOutput.toString();
		}


	 public String invertedHalfPyramid(int n, int size) {
		    StringBuilder htmlOutput = new StringBuilder();
		    htmlOutput.append("<pre style=\"font-size: ").append(size).append("px;\">\nInverted Half Pyramid\n");

		    // Nested loops to iterate through rows and columns
		    for (int i = n; i >= 1; i--) {
		        for (int j = 1; j <= i; j++) {
		            htmlOutput.append(" * ");
		        }
		        // Move to the next line after each row is completed
		        htmlOutput.append("\n");
		    }
		    // Closing the HTML 'pre' tag
		    htmlOutput.append("</pre>");
		    return htmlOutput.toString();
		}

		public String invertedAndRotatedHalfPyramid(int n, int size) {
		    StringBuilder htmlOutput = new StringBuilder();
		    htmlOutput.append("<pre style=\"font-size: ").append(size).append("px;\">\nInverted And Rotated Half Pyramid\n");

		    // Nested loops to iterate through rows and columns
		    for (int i = n; i >= 1; i--) {
		        // Printing spaces
		        for (int j = 1; j < i; j++) {
		            htmlOutput.append("   ");
		        }
		        // Printing asterisks
		        for (int j = 0; j <= n - i; j++) {
		            htmlOutput.append(" * ");
		        }
		        // Move to the next line after each row is completed
		        htmlOutput.append("\n");
		    }
		    // Closing the HTML 'pre' tag
		    htmlOutput.append("</pre>");
		    return htmlOutput.toString();
		}

		public String halfPyramidWithNumbers(int n, int size) {
		    StringBuilder htmlOutput = new StringBuilder();
		    htmlOutput.append("<pre style=\"font-size: ").append(size).append("px;\">\nHalf Pyramid With Numbers\n");

		    // Nested loops to iterate through rows and columns
		    for (int i = 1; i <= n; i++) {
		        for (int j = 1; j <= i; j++) {
		            htmlOutput.append("  "+j);
		        }
		        // Move to the next line after each row is completed
		        htmlOutput.append("\n");
		    }
		    // Closing the HTML 'pre' tag
		    htmlOutput.append("</pre>");
		    return htmlOutput.toString();
		}

		public String invertedHalfPyramidWithNumbers(int n, int size) {
		    StringBuilder htmlOutput = new StringBuilder();
		    htmlOutput.append("<pre style=\"font-size: ").append(size).append("px;\">\nInverted Half Pyramid With Numbers\n");

		    // Nested loops to iterate through rows and columns
		    for (int i = n; i >= 1; i--) {
		        for (int j = 1; j <= i; j++) {
		            htmlOutput.append("  "+j);
		        }
		        // Move to the next line after each row is completed
		        htmlOutput.append("\n");
		    }
		    // Closing the HTML 'pre' tag
		    htmlOutput.append("</pre>");
		    return htmlOutput.toString();
		}

		public String floydsTriangle(int n, int size) {
		    StringBuilder htmlOutput = new StringBuilder();
		    htmlOutput.append("<pre style=\"font-size: ").append(size).append("px;\">\nFloyd's Triangle\n");

		    int number = 1;
		    // Nested loops to iterate through rows and columns
		    for (int i = 1; i <= n; i++) {
		        for (int j = 1; j <= i; j++) {
		            htmlOutput.append(" "+number).append("  ");
		            number++;
		        }
		        // Move to the next line after each row is completed
		        htmlOutput.append("\n");
		    }
		    // Closing the HTML 'pre' tag
		    htmlOutput.append("</pre>");
		    return htmlOutput.toString();
		}

		public String butterfly(int n, int size) {
		    StringBuilder htmlOutput = new StringBuilder();
		    htmlOutput.append("<pre style=\"font-size: ").append(size).append("px;\">\nButterfly\n");

		    // Upper part
		    for (int i = 1; i <= n; i++) {
		        // Print asterisks
		        for (int j = 1; j <= i; j++) {
		            htmlOutput.append("*");
		        }
		        // Print spaces
		        int spaces = 2 * (n - i);
		        for (int j = 1; j <= spaces; j++) {
		            htmlOutput.append(" ");
		        }
		        // Print asterisks
		        for (int j = 1; j <= i; j++) {
		            htmlOutput.append("*");
		        }
		        // Move to the next line after each row is completed
		        htmlOutput.append("\n");
		    }

		    // Lower part
		    for (int i = n; i >= 1; i--) {
		        // Print asterisks
		        for (int j = 1; j <= i; j++) {
		            htmlOutput.append("*");
		        }
		        // Print spaces
		        int spaces = 2 * (n - i);
		        for (int j = 1; j <= spaces; j++) {
		            htmlOutput.append(" ");
		        }
		        // Print asterisks
		        for (int j = 1; j <= i; j++) {
		            htmlOutput.append("*");
		        }
		        // Move to the next line after each row is completed
		        htmlOutput.append("\n");
		    }

		    // Closing the HTML 'pre' tag
		    htmlOutput.append("</pre>");
		    return htmlOutput.toString();
		}

		public String solidRhombus(int n, int size) {
		    StringBuilder htmlOutput = new StringBuilder();
		    htmlOutput.append("<pre style=\"font-size: ").append(size).append("px;\">\nSolid Rhombus\n");

		    // Nested loops to iterate through rows and columns
		    for (int i = 1; i <= n; i++) {
		        // Print spaces
		        for (int j = 1; j <= n - i; j++) {
		            htmlOutput.append(" ");
		        }
		        // Print asterisks
		        for (int j = 1; j <= n; j++) {
		            htmlOutput.append("*");
		        }
		        // Move to the next line after each row is completed
		        htmlOutput.append("\n");
		    }
		    // Closing the HTML 'pre' tag
		    htmlOutput.append("</pre>");
		    return htmlOutput.toString();
		}

		public String numberPyramid(int n, int size) {
		    StringBuilder htmlOutput = new StringBuilder();
		    htmlOutput.append("<pre style=\"font-size: ").append(size).append("px;\">\nNumber Pyramid\n");

		    // Nested loops to iterate through rows and columns
		    for (int i = 1; i <= n; i++) {
		        // Print spaces
		        for (int j = 1; j <= n - i; j++) {
		            htmlOutput.append(" ");
		        }
		        // Print numbers
		        for (int j = 1; j <= i; j++) {
		            htmlOutput.append(i).append(" ");
		        }
		        // Move to the next line after each row is completed
		        htmlOutput.append("\n");
		    }
		    
		    htmlOutput.append("</pre>");
		    return htmlOutput.toString();
		}

		public String diamond(int n, int size) {
		    StringBuilder htmlOutput = new StringBuilder();
		    htmlOutput.append("<pre style=\"font-size: ").append(size).append("px;\">\nDiamond\n");

		    // Upper part
		    for (int i = 1; i <= n; i++) {
		        // Print spaces
		        for (int j = 1; j <= n - i; j++) {
		            htmlOutput.append(" ");
		        }
		        // Print asterisks
		        for (int j = 1; j <= 2 * i - 1; j++) {
		            htmlOutput.append("*");
		        }
		        // Move to the next line after each row is completed
		        htmlOutput.append("\n");
		    }

		    // Lower part
		    for (int i = n - 1; i >= 1; i--) {
		        // Print spaces
		        for (int j = 1; j <= n - i; j++) {
		            htmlOutput.append(" ");
		        }
		        // Print asterisks
		        for (int j = 1; j <= 2 * i - 1; j++) {
		            htmlOutput.append("*");
		        }
		        // Move to the next line after each row is completed
		        htmlOutput.append("\n");
		    }

		    // Closing the HTML 'pre' tag
		    htmlOutput.append("</pre>");
		    return htmlOutput.toString();
		}

public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
		Patterns patterns = new Patterns();

		// Example: Solid Rectangle
		System.out.print("Enter number of rows for Solid Rectangle: ");
		int rows = scan.nextInt();
		System.out.print("Enter number of columns for Solid Rectangle: ");
		int columns = scan.nextInt();
		String solidRectangleOutput = patterns.solidRectangle(rows, columns,50);
		System.out.println(solidRectangleOutput);
		String hollowRectangleOutput = patterns.hollowRectangle(rows, columns,50);
		System.out.println(hollowRectangleOutput);
		String halfPyramidOutput = patterns.halfPyramid(rows,50);
		System.out.println(halfPyramidOutput);
		String invertedHalfPyramidOutput = patterns.invertedHalfPyramid(rows,50);
		System.out.println(invertedHalfPyramidOutput);
		String invertedAndRotatedHalfPyramidOutput = patterns.invertedAndRotatedHalfPyramid(rows,50);
		System.out.println(invertedAndRotatedHalfPyramidOutput);
		String halfPyramidWithNumbersOutput = patterns.halfPyramidWithNumbers(rows,50);
		System.out.println(halfPyramidWithNumbersOutput);
		String invertedHalfPyramidWithNumbersOutput = patterns.invertedHalfPyramidWithNumbers(rows,50);
		System.out.println(invertedHalfPyramidWithNumbersOutput);
		String floydsTriangleOutput = patterns.floydsTriangle(rows,50);
		System.out.println(floydsTriangleOutput);
		String butterflyOutput = patterns.butterfly(rows,50);
		System.out.println(butterflyOutput);
		String solidRhombusOutput = patterns.solidRhombus(rows,50);
		System.out.println(solidRhombusOutput);
		String numberPyramidOutput = patterns.numberPyramid(rows,50);
		System.out.println(numberPyramidOutput);
		String diamondOutput = patterns.diamond(rows,50);
		System.out.println(diamondOutput);
		
		
	}
}
}



