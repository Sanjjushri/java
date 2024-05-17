package Course;

public class StaticKeyword {
    
    // static = modifier. A single copy of a variable/method is created and shred. 
    //          The class "owns" the static member 
    
    public static void main(String[] args){
        Friend friend1 = new Friend("Rick");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Sam");
    
        System.out.println(friend1.numberOfFriends);
        //  friend1, friend2, friend3 share the same numberofriends variable 

        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();
  
    }
}
