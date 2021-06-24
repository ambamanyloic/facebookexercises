package com.loic.projectfacebook.crackingcode.graphs;

import java.util.*;

public class BreadthFirstSearch {

    enum State {
        Unvisited,

        Visited,

        Visiting;
    }

    boolean search(Graph g, ListNode start, ListNode end) {
        if (start == end) return true;

        LinkedList<ListNode> queue = new LinkedList<>();

        /*for (ListNode u : g.getNodes()) {
            u.state = State.Unvisited;

        }*/

        //start.state = State.Visiting;
        queue.add(start);
        ListNode u;
        while (!queue.isEmpty()) {

            u = queue.removeFirst();  //II i.e., dequeue()

            if (u != null) {

               // for (ListNode v : u.getAdjacent()) {

                //    if (v.state == State.Unvisited) {
            //            if (v == end) {
                            return true;
            //            } else {
                //            v.state = State.Visiting;
            //                queue.add(v);
                        }

                    }

            //    }

             //   u.state = State.Visited;
           // }

    //    }
        return false;
    }
}
