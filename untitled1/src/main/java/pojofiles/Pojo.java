package pojofiles;

import java.util.ArrayList;

public class Pojo {

        private float id;
        private String dataset_code;
        private String database_code;
        private String name;
        private String description;
        private String refreshed_at;
        private String newest_available_date;
        private String oldest_available_date;
        ArrayList<Object> column_names = new ArrayList<Object>();
        private String frequency;
        private String type;
        private boolean premium;
        private String limit = null;
        private String transform = null;
        private String column_index = null;
        private String start_date;
        private String end_date;
        ArrayList<Object> data = new ArrayList<Object>();
        private String collapse = null;
        private String order = null;
        private float database_id;


        // Getter Methods

        public float getId() {
            return id;
        }

        public String getDataset_code() {
            return dataset_code;
        }

        public String getDatabase_code() {
            return database_code;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getRefreshed_at() {
            return refreshed_at;
        }

        public String getNewest_available_date() {
            return newest_available_date;
        }

        public String getOldest_available_date() {
            return oldest_available_date;
        }

        public String getFrequency() {
            return frequency;
        }

        public String getType() {
            return type;
        }

        public boolean getPremium() {
            return premium;
        }

        public String getLimit() {
            return limit;
        }

        public String getTransform() {
            return transform;
        }

        public String getColumn_index() {
            return column_index;
        }

        public String getStart_date() {
            return start_date;
        }

        public String getEnd_date() {
            return end_date;
        }

        public String getCollapse() {
            return collapse;
        }

        public String getOrder() {
            return order;
        }

        public float getDatabase_id() {
            return database_id;
        }

        // Setter Methods

        public void setId(float id) {
            this.id = id;
        }

        public void setDataset_code(String dataset_code) {
            this.dataset_code = dataset_code;
        }

        public void setDatabase_code(String database_code) {
            this.database_code = database_code;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setRefreshed_at(String refreshed_at) {
            this.refreshed_at = refreshed_at;
        }

        public void setNewest_available_date(String newest_available_date) {
            this.newest_available_date = newest_available_date;
        }

        public void setOldest_available_date(String oldest_available_date) {
            this.oldest_available_date = oldest_available_date;
        }

        public void setFrequency(String frequency) {
            this.frequency = frequency;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setPremium(boolean premium) {
            this.premium = premium;
        }

        public void setLimit(String limit) {
            this.limit = limit;
        }

        public void setTransform(String transform) {
            this.transform = transform;
        }

        public void setColumn_index(String column_index) {
            this.column_index = column_index;
        }

        public void setStart_date(String start_date) {
            this.start_date = start_date;
        }

        public void setEnd_date(String end_date) {
            this.end_date = end_date;
        }

        public void setCollapse(String collapse) {
            this.collapse = collapse;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        public void setDatabase_id(float database_id) {
            this.database_id = database_id;
        }
    }

