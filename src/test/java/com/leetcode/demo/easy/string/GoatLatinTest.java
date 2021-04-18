package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoatLatinTest {

    @Test
    public void solve01() {
        GoatLatin demo = new GoatLatin();

        String s1 = "I speak Goat Latin";
        String res1 = demo.solve01(s1);
        String expect1 = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";
        Assertions.assertEquals(expect1, res1);

        String s2 = "The quick brown fox jumped over the lazy dog";
        String res2 = demo.solve01(s2);
        String expect2 = "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa";
        Assertions.assertEquals(expect2, res2);

        String s3 = "Each word consists of lowercase and uppercase letters only";
        String res3 = demo.solve01(s3);
        String expect3 = "Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa andmaaaaaaa uppercasemaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa";
        Assertions.assertEquals(expect3, res3);
    }
}