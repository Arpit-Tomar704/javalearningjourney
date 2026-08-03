package Challenges;

 class course {
  static  int maxCapacity = 100;
  String courseName;
  int  enrollments;


  String[] enrolledStudents ;

  course(String courseName){
   this.courseName=courseName;
   this.enrollments =0;
   this.enrolledStudents = new String[maxCapacity];
  }
  
  static void setMaxCapacity(int maxCapacity){
   course.maxCapacity=maxCapacity;
  }
  void enrollStudent(String studentName){
   enrolledStudents[enrollments]= studentName;
   enrollments++;
  }

  void unenrollStuden(String studentName){
   System.out.println("student removed");
   enrollments--;

  }


}
