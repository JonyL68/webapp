package com.webapp.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

    @Entity
    @Table(name = "teritory", schema = "refrec")

    public class Teritory {

        private Integer id;
        private String nameFromFile;
        private String nameForSite;
        @JsonIgnore
        private Integer pindex;

        @Basic
        @Column(name = "pindex")
        public Integer getPindex() {
            return pindex;
        }

        public void setPindex(Integer pindex) {
            this.pindex = pindex;
        }

        @Id
        @Column(name = "id")
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        @Basic
        @Column(name = "name_from_file")
        public String getNameFromFile() {
            return nameFromFile;
        }

        public void setNameFromFile(String nameFromFile) {
            this.nameFromFile = nameFromFile;
        }

        @Basic
        @Column(name = "name_for_site")
        public String getNameForSite() {
            return nameForSite;
        }

        public void setNameForSite(String nameForSite) {
            this.nameForSite = nameForSite;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Teritory teritory = (Teritory) o;
            return Objects.equals(id, teritory.id) && Objects.equals(nameFromFile, teritory.nameFromFile) && Objects.equals(nameForSite, teritory.nameForSite);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, nameFromFile, nameForSite);
        }
    }


