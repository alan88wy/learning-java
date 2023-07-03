public class gpa {
      public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        double[] gpa = new double[studentIdList.length];
        
        for (int i = 0; i < studentIdList.length; i++) {
            char[] grades = studentsGrades[i];

            double totalGPA = 0.00;
        
            for (char grade : grades) {
                if (grade == 'A') {
                    totalGPA += 4;
                } else if (grade == 'B') {
                    totalGPA += 3;
                } if (grade == 'C') {
                    totalGPA += 2;
                }

                // gpa.add(totalGPA);
            }
            
            gpa[i] = totalGPA / grades.length;
            
        }
        
        return gpa;
    }
    
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        
        // perform parameter validation. Return null if passed parameters are not valid
        if (lower < 0.00) {
            System.out.println("Invalid lower parameter");
            return null;
        }

        if (higher < 0.00) {
            System.out.println("Invalid higher parameter");
            return null;
        }

        if (lower > higher) {
            System.out.println("The parameter lower must be higher than the higher parameter");
            return null;
        }


        // invoke calculateGPA
        
        double[] studentGPA = calculateGPA(studentIdList, studentsGrades);

        int arrLength = 0;

        for (double gpa : studentGPA) {
            if (gpa >= lower && gpa <= higher) {
                arrLength++;
            }
        }

        int[] students = new int[arrLength];

        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
    
        int j = 0;

        for (int i = 0; i < studentIdList.length; i++) {
            if (studentGPA[i] >= lower && studentGPA[i] <= higher) {
                students[j] = studentIdList[i];
                j++;
            }
        }

        return students;
    }
    

    public static void main(String[] args) {
        int[] studentIdList = {1001, 1002};

        char[][] studentGrades = { { 'A', 'A', 'A', 'B' }, { 'A', 'B', 'B' } };

        double lower = 3.2;
        double higher = 3.5;

        int[] students = getStudentsByGPA(lower, higher, studentIdList, studentGrades);

        if (students != null) {
            for (int student : students) {
                if (student != 0) {
                    System.out.println(student);
                }
                
            }

        }
        

    }
}
