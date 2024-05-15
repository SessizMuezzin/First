/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        int nodeLenght = 7;
        List<List<Edge>> graph = new ArrayList<>(nodeLenght);
        for (int i = 0; i < nodeLenght; i++) {
            graph.add(new ArrayList<>());
        }
        //0 cape may
        //1 atlantic city
        //2 camden
        //3 asbury park
        //4 trenton
        //5 woodbiridge
        //6 newark
        graph.get(0).add(new Edge(1,45));
        graph.get(0).add(new Edge(2,85));
        graph.get(1).add(new Edge(2,55));
        graph.get(1).add(new Edge(3,75));
        graph.get(2).add(new Edge(1,55));
        graph.get(2).add(new Edge(5,60));
        graph.get(2).add(new Edge(4,30));
        graph.get(3).add(new Edge(1,75));
        graph.get(3).add(new Edge(4,40));
        graph.get(3).add(new Edge(5,35));
        graph.get(4).add(new Edge(2,30));
        graph.get(4).add(new Edge(3,40));
        graph.get(4).add(new Edge(5,42));
        graph.get(5).add(new Edge(2,40));
        graph.get(5).add(new Edge(3,35));
        graph.get(5).add(new Edge(4,42));
        graph.get(5).add(new Edge(6,20));
        graph.get(6).add(new Edge(5,20));
    }
}
