package ru.netology.domain;

import ru.netology.info.CommentsInfo;
import ru.netology.info.CopyrightInfo;
import ru.netology.info.DonutInfo;
import ru.netology.info.GeoInfo;
import ru.netology.info.LikesInfo;
import ru.netology.info.PostSourceInfo;
import ru.netology.info.RepostsInfo;
import ru.netology.info.ViewsInfo;

public class Post {
    private int id;
    private int ownerId; // поле из документации
    private int fromId; // поле из документации
    private int createdBy; // поле из документации
    private int date; // поле из документации
    private String text;
    private int replyOwnerId; // поле из документации
    private int replyPostId; // поле из документации
    private int friendsOnly; // поле из документации
    private CommentsInfo commentsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
    private CopyrightInfo copyrightInfo; // поле из документации, в документации он типа object, под такой тип объекта мы создали отдельный класс CopyrightInfo
    private LikesInfo likesInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс LikesInfo
    private RepostsInfo repostsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс RepostsInfo
    private ViewsInfo viewsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс ViewsInfo
    private String postType; // поле из документации
    private PostSourceInfo postSourceInfo; // поле из документации, в документации он типа object, под такой тип объекта мы создали отдельный класс PostSourceInfo
    private GeoInfo geoInfo; // поле из документации, в документации он типа object, под такой тип объекта мы создали отдельный класс GeoInfo
    private int signerId; // поле из документации
    private boolean canPin; // поле из документации
    private boolean canDelete; // поле из документации
    private boolean canEdit; // поле из документации
    private boolean isPinned; // поле из документации
    private boolean markedAsAds; // поле из документации
    private boolean isFavorite; // поле из документации
    private DonutInfo donutInfo; // поле из документации, в документации он типа object, под такой тип объекта мы создали отдельный класс DonutInfo
    private int postponedId; // поле из документации

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public CopyrightInfo getCopyrightInfo() {
        return copyrightInfo;
    }

    public void setCopyrightInfo(CopyrightInfo copyrightInfo) {
        this.copyrightInfo = copyrightInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSourceInfo getPostSourceInfo() {
        return postSourceInfo;
    }

    public void setPostSourceInfo(PostSourceInfo postSourceInfo) {
        this.postSourceInfo = postSourceInfo;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean getCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(boolean isPinned) {
        this.isPinned = isPinned;
    }

    public boolean getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public DonutInfo getDonutInfo() {
        return donutInfo;
    }

    public void setDonutInfo(DonutInfo donutInfo) {
        this.donutInfo = donutInfo;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
