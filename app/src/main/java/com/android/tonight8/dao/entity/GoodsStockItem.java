package com.android.tonight8.dao.entity;

import com.android.tonight8.dao.DaoSession;
import de.greenrobot.dao.DaoException;

import com.android.tonight8.dao.GoodsSpecificationDao;
import com.android.tonight8.dao.GoodsStockItemDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table GOODS_STOCK_ITEM.
 */
public class GoodsStockItem {

    private long id;
    private Long goodsSpecificationId;
    private String name;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient GoodsStockItemDao myDao;

    private GoodsSpecification goodsSpecification;
    private Long goodsSpecification__resolvedKey;


    public GoodsStockItem() {
    }

    public GoodsStockItem(long id) {
        this.id = id;
    }

    public GoodsStockItem(long id, Long goodsSpecificationId, String name) {
        this.id = id;
        this.goodsSpecificationId = goodsSpecificationId;
        this.name = name;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getGoodsStockItemDao() : null;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getGoodsSpecificationId() {
        return goodsSpecificationId;
    }

    public void setGoodsSpecificationId(Long goodsSpecificationId) {
        this.goodsSpecificationId = goodsSpecificationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** To-one relationship, resolved on first access. */
    public GoodsSpecification getGoodsSpecification() {
        Long __key = this.goodsSpecificationId;
        if (goodsSpecification__resolvedKey == null || !goodsSpecification__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            GoodsSpecificationDao targetDao = daoSession.getGoodsSpecificationDao();
            GoodsSpecification goodsSpecificationNew = targetDao.load(__key);
            synchronized (this) {
                goodsSpecification = goodsSpecificationNew;
            	goodsSpecification__resolvedKey = __key;
            }
        }
        return goodsSpecification;
    }

    public void setGoodsSpecification(GoodsSpecification goodsSpecification) {
        synchronized (this) {
            this.goodsSpecification = goodsSpecification;
            goodsSpecificationId = goodsSpecification == null ? null : goodsSpecification.getId();
            goodsSpecification__resolvedKey = goodsSpecificationId;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
