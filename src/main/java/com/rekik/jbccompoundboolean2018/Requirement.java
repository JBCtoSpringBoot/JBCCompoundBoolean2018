package com.rekik.jbccompoundboolean2018;

public class Requirement {

    private boolean bFast;
    private boolean bCheap;
    private boolean bGood;

    public Requirement() {
        this.bFast = false;
        this.bCheap = false;
        this.bGood = false;
    }

    public boolean isbFast() {
        return bFast;
    }

    public void setbFast(boolean bFast) {
        this.bFast = bFast;
    }

    public boolean isbCheap() {
        return bCheap;
    }

    public void setbCheap(boolean bCheap) {
        this.bCheap = bCheap;
    }

    public boolean isbGood() {
        return bGood;
    }

    public void setbGood(boolean bGood) {
        this.bGood = bGood;
    }
}
