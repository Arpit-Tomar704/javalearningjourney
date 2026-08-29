package Challenges;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringJoiner;

class StudentPriorityQueue {
    static void main(String[] args) {
        PriorityQueue<student> queue = new PriorityQueue<>(new Comparator<student>() {
            @Override
            public int compare(student student, student o2) {
                return student.getGrade() - o2.getGrade();
            }
        });

        queue.offer(new student("Arpit",'A'));
        queue.offer(new student("Anurag",'B'));
        queue.offer(new student("shyaam",'C'));
        queue.offer(new student("Rohan",'A'));
        queue.offer(new student("Akaaash",'F'));
        System.out.printf("Queue is: %s\n",queue);
        System.out.printf("got %s\n", queue.poll() );
        System.out.printf("got %s\n", queue.poll() );
        System.out.printf("got %s\n", queue.poll() );
        System.out.printf("got %s\n", queue.poll() );
        System.out.printf("got %s\n", queue.poll() );





    }


    private static  class student{
        private final String name;
        private  final char grade;

        public student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public  char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + ": " +grade;
        }
    }
}
