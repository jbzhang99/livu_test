package com.rcplatform.livechat.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by admin on 2017/3/17.
 */
public class TuputechBean {


    /**
     * timestamp : 1489755074
     * message : success
     * 54bcfc6c329af61034f7c2fc : {"statistic":[2,0,0],"fileList":[{"rate":0.9917283058166504,"tag":"1","name":"http://lcpic2.rcplatformhk.com/video-chat/upload/1487153960663348774.jpg","label":0,"review":false},{"rate":0.8899382750193278,"tag":"1","name":"http://lcpic2.rcplatformhk.com/video-chat/upload/1487264078841461283.jpg","label":0,"review":false}],"reviewCount":0}
     * nonce : 0.026350246276706457
     * code : 0
     * 559e65b3040a5ee37e4505b3 : {"topNStatistic":[{"count":1,"label":20},{"count":1,"label":2}],"fileList":[{"rate":0.4245280623435974,"tag":"1","labels":[2,3,20,12,4],"name":"http://lcpic2.rcplatformhk.com/video-chat/upload/1487153960663348774.jpg","rates":[0.4245280623435974,0.3295653760433197,0.15579617023468018,0.034663259983062744,0.02397027239203453],"label":2,"review":true},{"rate":0.5519781112670898,"tag":"1","labels":[20,2,3,6,4],"name":"http://lcpic2.rcplatformhk.com/video-chat/upload/1487264078841461283.jpg","rates":[0.5519781112670898,0.3460884392261505,0.03821639344096184,0.029127005487680435,0.009993283078074455],"label":20,"review":true}],"reviewCount":2}
     */

    private Long timestamp;


    private String message;

    @JSONField(name = "54bcfc6c329af61034f7c2fc")
    private Eroticism eroticism;

    private String nonce;

    private int code;

    @JSONField(name = "559e65b3040a5ee37e4505b3")
    private Person person;


    @JSONField(name = "554202c4b01bd8ee3b6c005c")
    private GenderInfo genderInfo;


    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public Eroticism getEroticism() {
        return eroticism;
    }

    public void setEroticism(Eroticism eroticism) {
        this.eroticism = eroticism;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    public GenderInfo getGenderInfo() {
        return genderInfo;
    }

    public void setGenderInfo(GenderInfo genderInfo) {
        this.genderInfo = genderInfo;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TuputechBean{");
        sb.append("timestamp=").append(timestamp);
        sb.append(", message='").append(message).append('\'');
        sb.append(", eroticism=").append(eroticism);
        sb.append(", nonce='").append(nonce).append('\'');
        sb.append(", code=").append(code);
        sb.append(", person=").append(person);
        sb.append(", genderInfo=").append(genderInfo);
        sb.append('}');
        return sb.toString();
    }

    public static class Eroticism {
        /**
         * statistic : [2,0,0]
         * fileList : [{"rate":0.9917283058166504,"tag":"1","name":"http://lcpic2.rcplatformhk.com/video-chat/upload/1487153960663348774.jpg","label":0,"review":false},{"rate":0.8899382750193278,"tag":"1","name":"http://lcpic2.rcplatformhk.com/video-chat/upload/1487264078841461283.jpg","label":0,"review":false}]
         * reviewCount : 0
         */

        private int reviewCount;

        private List<Integer> statistic;

        private List<FileListBean> fileList;

        public int getReviewCount() {
            return reviewCount;
        }

        public void setReviewCount(int reviewCount) {
            this.reviewCount = reviewCount;
        }

        public List<Integer> getStatistic() {
            return statistic;
        }

        public void setStatistic(List<Integer> statistic) {
            this.statistic = statistic;
        }

        public List<FileListBean> getFileList() {
            return fileList;
        }

        public void setFileList(List<FileListBean> fileList) {
            this.fileList = fileList;
        }


        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Eroticism{");
            sb.append("reviewCount=").append(reviewCount);
            sb.append(", statistic=").append(statistic);
            sb.append(", fileList=").append(fileList);
            sb.append('}');
            return sb.toString();
        }

        public static class FileListBean {
            /**
             * rate : 0.9917283058166504
             * tag : 1
             * name : http://lcpic2.rcplatformhk.com/video-chat/upload/1487153960663348774.jpg
             * label : 0
             * review : false
             */

            private Double rate;
            private String tag;
            private String name;
            private Integer label;

            private boolean review;

            public Double getRate() {
                return rate;
            }

            public void setRate(Double rate) {
                this.rate = rate;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getLabel() {
                return label;
            }

            public void setLabel(Integer label) {
                this.label = label;
            }

            public boolean isReview() {
                return review;
            }

            public void setReview(boolean review) {
                this.review = review;
            }

            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder("FileListBean{");
                sb.append("rate=").append(rate);
                sb.append(", tag='").append(tag).append('\'');
                sb.append(", name='").append(name).append('\'');
                sb.append(", label=").append(label);
                sb.append(", review=").append(review);
                sb.append('}');
                return sb.toString();
            }
        }
    }



    public static class GenderInfo {
        /**
         * statistic : [2,0,0]
         * fileList : [{"rate":0.9917283058166504,"tag":"1","name":"http://lcpic2.rcplatformhk.com/video-chat/upload/1487153960663348774.jpg","label":0,"review":false},{"rate":0.8899382750193278,"tag":"1","name":"http://lcpic2.rcplatformhk.com/video-chat/upload/1487264078841461283.jpg","label":0,"review":false}]
         * reviewCount : 0
         */

        private int reviewCount;

        private List<Integer> statistic;

        private List<FileListBean> fileList;

        public int getReviewCount() {
            return reviewCount;
        }

        public void setReviewCount(int reviewCount) {
            this.reviewCount = reviewCount;
        }

        public List<Integer> getStatistic() {
            return statistic;
        }

        public void setStatistic(List<Integer> statistic) {
            this.statistic = statistic;
        }

        public List<FileListBean> getFileList() {
            return fileList;
        }

        public void setFileList(List<FileListBean> fileList) {
            this.fileList = fileList;
        }


        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Eroticism{");
            sb.append("reviewCount=").append(reviewCount);
            sb.append(", statistic=").append(statistic);
            sb.append(", fileList=").append(fileList);
            sb.append('}');
            return sb.toString();
        }

        public static class FileListBean {
            /**
             * rate : 0.9917283058166504
             * tag : 1
             * name : http://lcpic2.rcplatformhk.com/video-chat/upload/1487153960663348774.jpg
             * label : 0
             * review : false
             */

            private Double rate;
            private String tag;
            private String name;
            private Integer label;

            private boolean review;

            public Double getRate() {
                return rate;
            }

            public void setRate(Double rate) {
                this.rate = rate;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getLabel() {
                return label;
            }

            public void setLabel(Integer label) {
                this.label = label;
            }

            public boolean isReview() {
                return review;
            }

            public void setReview(boolean review) {
                this.review = review;
            }

            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder("FileListBean{");
                sb.append("rate=").append(rate);
                sb.append(", tag='").append(tag).append('\'');
                sb.append(", name='").append(name).append('\'');
                sb.append(", label=").append(label);
                sb.append(", review=").append(review);
                sb.append('}');
                return sb.toString();
            }
        }
    }

    public static class Person {
        /**
         * topNStatistic : [{"count":1,"label":20},{"count":1,"label":2}]
         * fileList : [{"rate":0.4245280623435974,"tag":"1","labels":[2,3,20,12,4],"name":"http://lcpic2.rcplatformhk.com/video-chat/upload/1487153960663348774.jpg","rates":[0.4245280623435974,0.3295653760433197,0.15579617023468018,0.034663259983062744,0.02397027239203453],"label":2,"review":true},{"rate":0.5519781112670898,"tag":"1","labels":[20,2,3,6,4],"name":"http://lcpic2.rcplatformhk.com/video-chat/upload/1487264078841461283.jpg","rates":[0.5519781112670898,0.3460884392261505,0.03821639344096184,0.029127005487680435,0.009993283078074455],"label":20,"review":true}]
         * reviewCount : 2
         */

        private Integer reviewCount;


        private List<TopNStatisticBean> topNStatistic;


        private List<FileListBeanX> fileList;


        public int getReviewCount() {
            return reviewCount;
        }

        public void setReviewCount(int reviewCount) {
            this.reviewCount = reviewCount;
        }

        public List<TopNStatisticBean> getTopNStatistic() {
            return topNStatistic;
        }

        public void setTopNStatistic(List<TopNStatisticBean> topNStatistic) {
            this.topNStatistic = topNStatistic;
        }

        public List<FileListBeanX> getFileList() {
            return fileList;
        }

        public void setFileList(List<FileListBeanX> fileList) {
            this.fileList = fileList;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Person{");
            sb.append("reviewCount=").append(reviewCount);
            sb.append(", topNStatistic=").append(topNStatistic);
            sb.append(", fileList=").append(fileList);
            sb.append('}');
            return sb.toString();
        }

        public static class TopNStatisticBean {
            /**
             * count : 1
             * label : 20
             */

            private Integer count;

            private Integer label;

            public Integer getCount() {
                return count;
            }

            public void setCount(Integer count) {
                this.count = count;
            }

            public Integer getLabel() {
                return label;
            }

            public void setLabel(Integer label) {
                this.label = label;
            }

            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder("TopNStatisticBean{");
                sb.append("count=").append(count);
                sb.append(", label=").append(label);
                sb.append('}');
                return sb.toString();
            }
        }

        public static class FileListBeanX {
            /**
             * rate : 0.4245280623435974
             * tag : 1
             * labels : [2,3,20,12,4]
             * name : http://lcpic2.rcplatformhk.com/video-chat/upload/1487153960663348774.jpg
             * rates : [0.4245280623435974,0.3295653760433197,0.15579617023468018,0.034663259983062744,0.02397027239203453]
             * label : 2
             * review : true
             */

            private Double rate;

            private String tag;

            private String name;

            private Integer label;

            private Boolean review;

            private List<Integer> labels;

            private List<Double> rates;

            public Double getRate() {
                return rate;
            }

            public void setRate(Double rate) {
                this.rate = rate;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getLabel() {
                return label;
            }

            public void setLabel(Integer label) {
                this.label = label;
            }

            public Boolean getReview() {
                return review;
            }

            public void setReview(Boolean review) {
                this.review = review;
            }

            public List<Integer> getLabels() {
                return labels;
            }

            public void setLabels(List<Integer> labels) {
                this.labels = labels;
            }

            public List<Double> getRates() {
                return rates;
            }

            public void setRates(List<Double> rates) {
                this.rates = rates;
            }

            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder("FileListBeanX{");
                sb.append("rate=").append(rate);
                sb.append(", tag='").append(tag).append('\'');
                sb.append(", name='").append(name).append('\'');
                sb.append(", label=").append(label);
                sb.append(", review=").append(review);
                sb.append(", labels=").append(labels);
                sb.append(", rates=").append(rates);
                sb.append('}');
                return sb.toString();
            }
        }
    }
}
