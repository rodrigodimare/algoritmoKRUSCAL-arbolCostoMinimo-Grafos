public class app {
    public static void main(String[] args)
    {

        /* Let us create following weighted graph
                 2
            1--------2
            | 3 \  / |
           4|    \   |2
            | /5   \ |
            3--------4
                1       */

        int V = 4; // Number of vertices in graph
        int E = 6; // Number of edges in graph
        Graph graph = new Graph(V, E);

        // add edge 0-1
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 2;

        // add edge 0-2
        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 4;

        // add edge 0-3
        graph.edge[2].src = 0;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 3;

        // add edge 1-3
        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 2;

        // add edge 2-3
        graph.edge[4].src = 1;
        graph.edge[4].dest = 2;
        graph.edge[4].weight = 5;

        // add edge 2-3
        graph.edge[5].src = 1;
        graph.edge[5].dest = 2;
        graph.edge[5].weight = 1;

        // Function call
        graph.KruskalMST();

        System.out.println("\nEste algoritmo me sirve cuando necesito operar sobre las aristas");
        System.out.println("Se complica un poco cuando necesito operar con los nodos");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Por ejemplo:");
        System.out.println("Si yo tengo 4 ciudades, 2 tienen generadores de electricidad y 2 no");
        System.out.println("y quiero proveer de energía a estas ciudades sin electricidad, es mas");
        System.out.println("conveniente operar con los nodos que con las aristas");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Para operar con los nodos ver Algoritmo Prim");
    }
}

