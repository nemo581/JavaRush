package com.javarush.task.task21.task2108;

/* 
Клонирование растений
*/

public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        try {
            clone = (Tree) tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(clone.branches);
    }

    public static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable {
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        public String[] getBranches() {
            return branches;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Tree cloneTree = (Tree) super.clone();
            String[] cloneBranches = new String[cloneTree.getBranches().length];
            for (int i = 0; i < cloneTree.getBranches().length; i++) {
                cloneBranches[i] = cloneTree.getBranches()[i];
            }
            cloneTree.branches = cloneBranches;
            return cloneTree;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || this.getClass() != obj.getClass()) return false;
            Tree tree = (Tree) obj;
            if (this.branches.length != tree.branches.length) return false;
            if (!this.getName().equals(tree.getName())) return false;
            for (int i = 0; i < this.branches.length; i++) {
                if (!this.branches[i].equals(tree.branches[i])) return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = this.branches.length;
            result = 31 * result + (this.branches != null ? this.branches.hashCode() : 0);
            return result;
        }
    }
}