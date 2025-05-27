package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    // 自分のじゃんけんの手を入力
    public String getMyChoice() {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        
        String hand = null;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            hand = scanner.nextLine();
            if (hand.equals("r") || hand.equals("s") || hand.equals("p")) {
                break;
            } else {
                System.out.println("エラー：じゃんけんの手を入力してください。");
            }
        }
        
        scanner.close();
        return hand;
    }
    
    // 対戦相手のじゃんけんの手を乱数で選ぶ
    public String getRandom() {
        String[] handArray = { "r", "s", "p" };
        return handArray[(int)Math.floor(Math.random() * handArray.length)];
    }
    
    // じゃんけんを行う
    public void playGame(String myHand, String otherHand) {
        HashMap<String, String> handMap = new HashMap<String, String>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
        
        if (!handMap.containsKey(myHand) || !handMap.containsKey(otherHand)) {
            throw new IllegalArgumentException("じゃんけんの手を引数に渡してください(r, s, pのいずれか)。");
        }
        
        System.out.println("自分の手は" + handMap.get(myHand) + ",対戦相手の手は" + handMap.get(otherHand));
        
        String hands = myHand + otherHand;
        switch (hands) {
            case "rr", "ss", "pp" -> System.out.println("あいこです");
            case "rs", "sp", "pr" -> System.out.println("自分の勝ちです");
            case "sr", "ps", "rp" -> System.out.println("自分の負けです");
            default -> System.out.println("じゃんけん失敗（やり直してください）");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
