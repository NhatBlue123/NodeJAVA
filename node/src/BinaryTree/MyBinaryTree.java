package BinaryTree;

import BinaryTree.TNode;

@SuppressWarnings("unused")
public class MyBinaryTree{
   TNode root;

   public void createTree()
   {
      TNode A = new TNode(7, new TNode(2), new TNode(6));
      TNode B = new TNode(5, null, new TNode(9));
      root = new TNode(2, A, B);
   }
   public void duyet1(TNode T)
   {
      if (T != null) {
         System.out.println(T.data);
         duyet1(T.left);
         duyet1(T.right);
      }

   }
   public void duyet2(TNode T)
   {
      if (T != null) {
         duyet2(T.left);
         System.out.println(T.data);
         duyet2(T.right);
         
      }
   }
   public void duyet3(TNode T)
   {
      if (T != null) {
         duyet2(T.left);
         duyet2(T.right);
         System.out.println(T.data);
      }
   }
   public void duyetTienTu()
   {
       duyet1(root);
   }
   public void duyetTrungTu()
   {
       duyet2(root);
   }
   public void duyetHauTu()
   {
       duyet3(root);
   }
   public static void main(String[] args) {
    MyBinaryTree tree = new MyBinaryTree();
    tree.createTree();
   //  tree.duyetTienTu();
   //  tree.duyetTrungTu();
    tree.duyetHauTu();
   }
}
