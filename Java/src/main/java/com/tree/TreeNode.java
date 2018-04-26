package com.tree;

import lombok.Data;
import lombok.NonNull;

/**
 * @author apktool
 * @date 2018-04-26 08:27
 */
@Data
public class TreeNode {
    @NonNull
    private int val;
    private TreeNode lchild;
    private TreeNode rchild;
}
