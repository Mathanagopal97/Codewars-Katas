/*
In this coming November, the United States will be electing a new president. This man (or woman) will be responsible for a great deal of things required by the government.

Donald Trump is on the loose and he's gunning for this power at full speed ahead. While it is unlikely that he will succeed, it is our duty to stop his schemes.

A common method politicians use is called Gerrymandering. This is when districted boundries are manipulated in such a way that the losing candidate recieves a majority of votes in a majority of districts.

To Wikipedia - https://en.wikipedia.org/wiki/Gerrymandering

https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/How_to_Steal_an_Election_-_Gerrymandering.svg/720px-How_to_Steal_an_Election_-_Gerrymandering.svg.png
In order to stop this, we must create a system that will elect a cadidate solely based on votes, not disctricts or a representative group that's interests may not align with our own. It is our duty to put a stop to this. Write a program that will take the votes from the districts and precincts, and return an array of each candidates vote count.

eg: input = [49,50],[99,100],[21,24],[501,10] output = [670,184] You do not need to worry about Trump doing more tricky things... yet...

To bring further incentive to stop Trump and his wild scheming, here are a few quotes from Donald himself:

"I will be the greatest jobs president that God ever created."

"I try to learn from the past, but I plan for the future by focusing exclusively on the present. That's where the fun is."

"I don't think Ivanka would do that, although she does have a very nice figure. I've said if Ivanka weren't my daughter, perhaps I'd be dating her."

"The beauty of me is that I'm very rich."
*/

public class VotesProgram {
    public static int[] getSum(int[][] votes) {
       int[] results = {0,0};
       for(int i=0;i<votes.length;i++){
         results[0] = results[0]+votes[i][0];
         results[1] = results[1]+votes[i][1];
       }       
       return results;
    }

    public static void main(String[] args) {
      int[] solution = getSum(new int[][]{{12,44},{10,11},{93,129},{4,6},{40,39},{1,0}});
      for(int i: solution)
        System.out.print(i+" ");
    }
}