package Collection;

import java.util.PriorityQueue;

class Ticket implements Comparable<Ticket>{
        String issue;
        int priority;

    public Ticket(String issue,int priority){
        this.issue=issue;
        this.priority=priority;
    }
    public int compareTo(Ticket other) {
       return Integer.compare(this.priority, other.priority);
    }
        public String toString(){
        return "Ticket[Issue: " + issue + ", Priority: " + priority + "]";
        }
}
class AdminHelpDesk{
    private PriorityQueue<Ticket> ticketQueue;
    public AdminHelpDesk(){
        ticketQueue=new PriorityQueue<>();
    }
    public void addTicket(String issue,int priority){
        Ticket ticket=new Ticket( issue,priority);
        ticketQueue.offer(ticket);
    }
    public void processTicket(){
        if(!ticketQueue.isEmpty()){
            System.out.println("Processing:"+ticketQueue.poll());
        }
        else{
            System.out.println("No ticket to process");
        }
    }
    public boolean hasTicket(){
        return !ticketQueue.isEmpty();
    }
}
class HelpDesk {
    public static void main(String[] args) {
        AdminHelpDesk helpDesk = new AdminHelpDesk();
        helpDesk.addTicket("Bug in login page", 1);
        helpDesk.addTicket("UI rendering issue", 3);
        helpDesk.addTicket("Database connection issue", 2);
        while (helpDesk.hasTicket()) {
            helpDesk.processTicket();
        }
    }
}