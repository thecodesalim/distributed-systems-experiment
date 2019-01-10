import java.util.ArrayList;

//Represents a single server
public class Node {
    protected int latency, distance, workload;
    protected String name;
    static ArrayList<Node> serverList = new ArrayList<Node>();
    static ArrayList<Client> clientList = new ArrayList<Client>();
    public Node(String name,int latency, int distance, int workload){
        this.name = name;
        this.latency = latency;
        this.distance = distance;
        this.workload = workload;
    }

    public String getName() {
        return this.name;
    }

    public int getLatency() {
        return this.latency;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getWorkload() {
        return this.workload;
    }

    public void setWorkload(int newWorkload) {
        if(this.workload <= 100){
            this.workload += newWorkload;
        }
    }

    public static void connectServer(ArrayList<Node> s, ArrayList<Client> c){
        for(Node server: s){
            for(Client client: c){
                if((client.getFlag()) && (server.getWorkload() < 100)){
                    if((client.getLatency() < 150) && ((client.getWorkload() + server.getWorkload() ) < 100)) {
                        server.setWorkload(client.getWorkload());
                        System.out.println(client.getName() + " >>>> "  + server.getName());
                        client.setFlag(false);  
                        
                    }

                    else if((client.getLatency() < 150) || ((client.getWorkload() + server.getWorkload() ) < 100) ) {
                        server.setWorkload(client.getWorkload());
                        System.out.println(client.getName() + " >>>> "  + server.getName());
                        client.setFlag(false); 
                    }

                    else {
                        System.out.println("No Optimal Server Available");
                        client.setFlag(false); 
                    }
                }
            }   
        }
    }

    public static void main(String[] args) {

        //Few test cases
        Node a = new Node("Server 1", 50, 50, 50);
        Node aa = new Node(" Server 2", 200, 50, 30);
        Client b = new Client("Client 1", 50, 50, 69, true);
        Client bb = new Client("Client 2", 50, 50, 70, true);

        serverList.add(a);
        serverList.add(aa);
        clientList.add(b);
        clientList.add(bb);

        connectServer(serverList, clientList);
        
    }
  }

  //Represents a single client
class Client {
    protected String name;
    protected int latency, distance, workload;
    protected boolean flag;
    public Client(String name, int latency, int distance, int workload, boolean flag){
        this.name = name;
        this.latency = latency;
        this.distance = distance;
        this.workload = workload;
        this.flag = flag;
    }

    public String getName() {
        return this.name;
    }

    public int getLatency() {
        return this.latency;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getWorkload() {
        return this.workload;
    }

    public boolean getFlag() {
        return this.flag;
    }

    public void setFlag(boolean f) {
        this.flag = f;
    }
  }

  
