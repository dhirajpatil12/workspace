
class test4{
	

int numwords = scan.nextInt();
    String sentence = scan.nextLine();
    String shortestword = new String();
    String[] words = sentence.split(" ");
    for (int i = 0; i < numwords; i++){
        if (shortestword.length() < words[i].length()){
            shortestword = words[i];
    
        }
    }
    System.out.printf(shortestword);
}