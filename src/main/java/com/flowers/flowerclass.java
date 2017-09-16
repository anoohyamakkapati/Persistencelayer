package com.flowers;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FlowerShop")
public class flowerclass {
    @Id
    int FlowerId;
    String FlowerName;

    public int getFlowerId() {
        return FlowerId;
    }

    public void setFlowerId(int flowerId) {
        FlowerId = flowerId;
    }

    public String getFlowerName() {
        return FlowerName;
    }

    public void setFlowerName(String flowerName) {
        FlowerName = flowerName;
    }

}
