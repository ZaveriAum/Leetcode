import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        String [] strs = {"tho","tin","erg","end","pug","ton","alb","mes","job","ads","soy","toe","tap","sen","ape","led","rig","rig","con","wac","gog","zen","hay","lie","pay","kid","oaf","arc","hay","vet","sat","gap","hop","ben","gem","dem","pie","eco","cub","coy","pep","wot","wee"};
        String [] strs = {"hay", "rin", "rig", "hay", "rig"};
        List<List<String>> answer = sol.groupAnagrams(strs);
        System.out.print("[");
        for (int i = 0; i < answer.size(); i++) {
            System.out.print("[");
            for (int j = 0; j < answer.get(i).size(); j++) {
                System.out.print("'"+ answer.get(i).get(j) + "' ");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}
/*
* [["wee"],["pep"],["cub"],["eco"],["dem"],["gap"],
* ["vet"],["job"],["ben"],["toe"],["hay","hay"]
* ,["mes"],["ads"],["alb"],["wot"],["gem"],["oaf"],
* ["hop"],["ton"] ,["pug"],["end"],["con"],["coy"],
* ["sat"],["soy"],["pay"],["tin"],["pie"],["ape"],
* ["tho"],["erg"],["sen"],["rig","rig"],["tap"],
* ["wac"],["gog"],["led"],["zen"],["arc"],["lie"],["kid"]]*/