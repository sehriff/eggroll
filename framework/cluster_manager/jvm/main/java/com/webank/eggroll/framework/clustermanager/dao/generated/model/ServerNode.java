/*
 * Copyright (c) 2019 - now, Eggroll Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package com.webank.eggroll.framework.clustermanager.dao.generated.model;

import java.io.Serializable;
import java.util.Date;

public class ServerNode implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_node.server_node_id
     *
     * @mbg.generated
     */
    private Long serverNodeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_node.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_node.server_cluster_id
     *
     * @mbg.generated
     */
    private Long serverClusterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_node.host
     *
     * @mbg.generated
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_node.port
     *
     * @mbg.generated
     */
    private Integer port;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_node.node_type
     *
     * @mbg.generated
     */
    private String nodeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_node.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_node.last_heartbeat_at
     *
     * @mbg.generated
     */
    private Date lastHeartbeatAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_node.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_node.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table server_node
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_node.server_node_id
     *
     * @return the value of server_node.server_node_id
     *
     * @mbg.generated
     */
    public Long getServerNodeId() {
        return serverNodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_node.server_node_id
     *
     * @param serverNodeId the value for server_node.server_node_id
     *
     * @mbg.generated
     */
    public void setServerNodeId(Long serverNodeId) {
        this.serverNodeId = serverNodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_node.name
     *
     * @return the value of server_node.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_node.name
     *
     * @param name the value for server_node.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_node.server_cluster_id
     *
     * @return the value of server_node.server_cluster_id
     *
     * @mbg.generated
     */
    public Long getServerClusterId() {
        return serverClusterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_node.server_cluster_id
     *
     * @param serverClusterId the value for server_node.server_cluster_id
     *
     * @mbg.generated
     */
    public void setServerClusterId(Long serverClusterId) {
        this.serverClusterId = serverClusterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_node.host
     *
     * @return the value of server_node.host
     *
     * @mbg.generated
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_node.host
     *
     * @param host the value for server_node.host
     *
     * @mbg.generated
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_node.port
     *
     * @return the value of server_node.port
     *
     * @mbg.generated
     */
    public Integer getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_node.port
     *
     * @param port the value for server_node.port
     *
     * @mbg.generated
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_node.node_type
     *
     * @return the value of server_node.node_type
     *
     * @mbg.generated
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_node.node_type
     *
     * @param nodeType the value for server_node.node_type
     *
     * @mbg.generated
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType == null ? null : nodeType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_node.status
     *
     * @return the value of server_node.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_node.status
     *
     * @param status the value for server_node.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_node.last_heartbeat_at
     *
     * @return the value of server_node.last_heartbeat_at
     *
     * @mbg.generated
     */
    public Date getLastHeartbeatAt() {
        return lastHeartbeatAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_node.last_heartbeat_at
     *
     * @param lastHeartbeatAt the value for server_node.last_heartbeat_at
     *
     * @mbg.generated
     */
    public void setLastHeartbeatAt(Date lastHeartbeatAt) {
        this.lastHeartbeatAt = lastHeartbeatAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_node.created_at
     *
     * @return the value of server_node.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_node.created_at
     *
     * @param createdAt the value for server_node.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_node.updated_at
     *
     * @return the value of server_node.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_node.updated_at
     *
     * @param updatedAt the value for server_node.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table server_node
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serverNodeId=").append(serverNodeId);
        sb.append(", name=").append(name);
        sb.append(", serverClusterId=").append(serverClusterId);
        sb.append(", host=").append(host);
        sb.append(", port=").append(port);
        sb.append(", nodeType=").append(nodeType);
        sb.append(", status=").append(status);
        sb.append(", lastHeartbeatAt=").append(lastHeartbeatAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table server_node
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ServerNode other = (ServerNode) that;
        return (this.getServerNodeId() == null ? other.getServerNodeId() == null : this.getServerNodeId().equals(other.getServerNodeId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getServerClusterId() == null ? other.getServerClusterId() == null : this.getServerClusterId().equals(other.getServerClusterId()))
            && (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getNodeType() == null ? other.getNodeType() == null : this.getNodeType().equals(other.getNodeType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLastHeartbeatAt() == null ? other.getLastHeartbeatAt() == null : this.getLastHeartbeatAt().equals(other.getLastHeartbeatAt()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table server_node
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServerNodeId() == null) ? 0 : getServerNodeId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getServerClusterId() == null) ? 0 : getServerClusterId().hashCode());
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLastHeartbeatAt() == null) ? 0 : getLastHeartbeatAt().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }
}