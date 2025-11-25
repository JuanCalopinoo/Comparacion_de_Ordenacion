package edu.unl.cc.model;

public class ItemInventario implements Comparable<ItemInventario> {

    private String id;
    private String insumo;
    private int stock;

    public ItemInventario(String id, String insumo, int stock) {
        this.id = id;
        this.insumo = insumo;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public String getInsumo() {
        return insumo;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public int compareTo(ItemInventario o) {
        return Integer.compare(this.stock, o.stock);
    }

    @Override
    public String toString() {
        return id + " | Insumo= " + insumo + " | Stock= " + stock + "\n";
    }
}



