package controllers;

import play.mvc.*;



public class Application extends Controller {

    public static Result index(int a,int b,int c) {
       double d=b*b-4*a*c;
       double x1=-b+Math.sqrt(d)/2*a;
       double x2=-b-Math.sqrt(d)/2*a;
       
       return ok("x1 = "+x1+"\nx2 = "+x2);
    }

}
