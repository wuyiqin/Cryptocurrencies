import java.util.*;

import static java.util.Arrays.sort;

/* CompliantNode refers to a node that follows the rules (not malicious)*/
public class CompliantNode implements Node {

    private double p_graph;
    private double p_malicious;
    private double p_txDistribution;
    private int numRounds;
    private Set<Transaction> pendingTransactions;
    //HashMap<Transaction,Integer> hm;

    boolean[]followees;
    boolean[]blacklist;

    public CompliantNode(double p_graph, double p_malicious, double p_txDistribution, int numRounds) {
        // IMPLEMENT THIS
        this.p_graph = p_graph;
        this.p_malicious = p_malicious;
        this.p_txDistribution = p_txDistribution;
        this.numRounds = numRounds;
        //hm = new HashMap<Transaction,Integer>();

    }

    public void setFollowees(boolean[] followees) {
        // IMPLEMENT THIS
        this.followees=followees;
        this.blacklist = new boolean[followees.length];
    }

    public void setPendingTransaction(Set<Transaction> pendingTransactions) {
        // IMPLEMENT THIS
        this.pendingTransactions = pendingTransactions;

    }

    public Set<Transaction> sendToFollowers() {
        // IMPLEMENT THIS
        // you need to renew you consensus, or the bad date will not out;
        //return pendingTransactions;

        Set<Transaction> temp = new HashSet<Transaction>(pendingTransactions);
        pendingTransactions.clear();
        return temp;


    }

    public void receiveFromFollowees(Set<Candidate> candidates) {
        // IMPLEMENT THIS
//        for (Candidate candidate : candidates) {
//            if(hm.containsKey(candidate.tx)){
//                hm.put(candidate.tx,hm.get(candidate.tx)+1);
//            } else {
//                hm.put(candidate.tx,1);
//            }
//
//            if(hm.get(candidate.tx)>Math.max(3,p_txDistribution*p_graph*p_malicious*candidates.size()*10)*p_txDistribution*p_malicious){
//                pendingTransactions.add(candidate.tx);
//            }
//        }
        //TreeMap<Transaction,Integer> t= new TreeMap<>();
        //Transaction cann't be sorted.
//        TreeSet<Transaction>t = new TreeSet<>();
//        for(Candidate c:candidates){
//            //pendingTransactions.add(c.tx);
//            t.add(c.tx);
//        }
//        pendingTransactions.addAll(t);

        //when I sort the list, it doesn't improve.
//        int[] temp= new int[candidates.size()];
//        int i=0;
//        for(Candidate c:candidates){
//            temp[i++]=c.tx.id;
//        }
//        sort(temp);
//        for(i=0;i<temp.length;i++){
//            pendingTransactions.add(new Transaction(temp[i]));
//        }



    }
}
