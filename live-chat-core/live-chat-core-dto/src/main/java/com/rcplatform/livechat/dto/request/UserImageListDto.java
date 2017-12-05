package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Yang Peng on 2017/5/3.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@ApiModel
public class UserImageListDto implements Serializable{


    @ApiModelProperty(value = "更新图片列表（需要替换原来的图片,该列表中元素顺序需要和 updateImages相同）(更新图片时必须提交)")
    private List<UserImageDto> updateImageList;


    @ApiModelProperty(value = "更新图片列表顺序（在只更新原图片的顺序，不更新图片时使用此属性),如要更新原图片的url，请在此处提交url地址")
    private List<UserImageDto> updateSortImageList;


    @ApiModelProperty(value = "新增图片时指定图片顺序,该列表中顺序和addImages的顺序相同,可直接在其中指定图片url (新增图片时必须提交)")
    private List<UserImageDto> addImageSortList;


    @ApiModelProperty(value = "头像url,在调整头像顺序时使用,请填写已存在的图片url,不可以和headImg图片文件参数同时存在")
    private String headImgUrl;


    @ApiModelProperty(value = "背景url,在调整背景顺序时使用,请填写已存在的图片url，不可以和background图片文件参数同时存在")
    private String backgroundUrl;


    @ApiModelProperty(value = "删除的图片id列表")
    private List<Integer> deleteImageIds;


    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    public List<UserImageDto> getUpdateImageList() {
        return updateImageList;
    }

    public void setUpdateImageList(List<UserImageDto> updateImageList) {
        this.updateImageList = updateImageList;
    }

    public List<UserImageDto> getUpdateSortImageList() {
        return updateSortImageList;
    }

    public void setUpdateSortImageList(List<UserImageDto> updateSortImageList) {
        this.updateSortImageList = updateSortImageList;
    }

    public List<UserImageDto> getAddImageSortList() {
        return addImageSortList;
    }

    public void setAddImageSortList(List<UserImageDto> addImageSortList) {
        this.addImageSortList = addImageSortList;
    }

    public List<Integer> getDeleteImageIds() {
        return deleteImageIds;
    }

    public void setDeleteImageIds(List<Integer> deleteImageIds) {
        this.deleteImageIds = deleteImageIds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserImageListDto{");
        sb.append("updateImageList=").append(updateImageList);
        sb.append(", updateSortImageList=").append(updateSortImageList);
        sb.append(", addImageSortList=").append(addImageSortList);
        sb.append('}');
        return sb.toString();
    }
}
