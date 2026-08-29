package chap25_Enums;

 public enum TrafficLight {

     RED("stop"), GREEN("start") ,YELLOW("slowdown");


     private final  String action;

     TrafficLight(String action) {
         this.action = action;
     }
 }
