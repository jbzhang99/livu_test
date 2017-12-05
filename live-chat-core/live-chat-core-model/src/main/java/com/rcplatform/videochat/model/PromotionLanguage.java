package com.rcplatform.videochat.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by fj on 2017/8/8.
 */
@Table(name = "rc_promotion_language")
public class PromotionLanguage {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        /**
         * 语言代码
         */
        private String languageCode;
        /**
         * 推广id
         */
        @Column(name = "promotion_id")
        private Integer promotionId;

        /**
         * 推广位置
         */
        @Column(name = "promotion_name")
        private String promotionName;

        /**
         * 文案1
         */
        @Column(name = "content_one")
        private String contentOne;

        /**
         * 文案2
         */
        @Column(name = "content_two")
        private String contentTwo;

        /**
         * 语言id
         */
        @Column(name = "language_id")
        private Integer languageId;

        /**
         * 语言名称
         */
        @Column(name = "language_name")
        private String languageName;

        /**
         * 创建时间
         */
        @Column(name = "create_time")
        private Date createTime;

        /**
         * @return id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * 获取推广id
         *
         * @return promotion_id - 推广id
         */
        public Integer getPromotionId() {
            return promotionId;
        }

        /**
         * 设置推广id
         *
         * @param promotionId 推广id
         */
        public void setPromotionId(Integer promotionId) {
            this.promotionId = promotionId;
        }

        /**
         * 获取文案1
         *
         * @return content_one - 文案1
         */
        public String getContentOne() {
            return contentOne;
        }

        /**
         * 设置文案1
         *
         * @param contentOne 文案1
         */
        public void setContentOne(String contentOne) {
            this.contentOne = contentOne;
        }

        /**
         * 获取文案2
         *
         * @return content_two - 文案2
         */
        public String getContentTwo() {
            return contentTwo;
        }

        /**
         * 设置文案2
         *
         * @param contentTwo 文案2
         */
        public void setContentTwo(String contentTwo) {
            this.contentTwo = contentTwo;
        }

        /**
         * 获取语言id
         *
         * @return language_id - 语言id
         */
        public Integer getLanguageId() {
            return languageId;
        }

        /**
         * 设置语言id
         *
         * @param languageId 语言id
         */
        public void setLanguageId(Integer languageId) {
            this.languageId = languageId;
        }

        /**
         * 获取语言名称
         *
         * @return language_name - 语言名称
         */
        public String getLanguageName() {
            return languageName;
        }

        /**
         * 设置语言名称
         *
         * @param languageName 语言名称
         */
        public void setLanguageName(String languageName) {
            this.languageName = languageName;
        }

        /**
         * 获取创建时间
         *
         * @return create_time - 创建时间
         */
        public Date getCreateTime() {
            return createTime;
        }

        /**
         * 设置创建时间
         *
         * @param createTime 创建时间
         */
        public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }

        public String getPromotionName() {
                return promotionName;
        }

        public void setPromotionName(String promotionName) {
                this.promotionName = promotionName;
        }

        public String getLanguageCode() {
                return languageCode;
        }

        public void setLanguageCode(String languageCode) {
                this.languageCode = languageCode;
        }
}
