/*
 * Copyright (c) 2017 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.sdk.client.model.nodes.objects;

import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.model.nodes.variables.PropertyNode;
import org.eclipse.milo.opcua.sdk.client.model.types.objects.AuditConditionConfirmEventType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ByteString;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;

public class AuditConditionConfirmEventNode extends AuditConditionEventNode implements AuditConditionConfirmEventType {
    public AuditConditionConfirmEventNode(OpcUaClient client, NodeId nodeId) {
        super(client, nodeId);
    }

    public CompletableFuture<PropertyNode> getEventIdNode() {
        return getPropertyNode(AuditConditionConfirmEventType.EVENT_ID);
    }

    public CompletableFuture<ByteString> getEventId() {
        return getProperty(AuditConditionConfirmEventType.EVENT_ID);
    }

    public CompletableFuture<StatusCode> setEventId(ByteString value) {
        return setProperty(AuditConditionConfirmEventType.EVENT_ID, value);
    }

    public CompletableFuture<PropertyNode> getCommentNode() {
        return getPropertyNode(AuditConditionConfirmEventType.COMMENT);
    }

    public CompletableFuture<LocalizedText> getComment() {
        return getProperty(AuditConditionConfirmEventType.COMMENT);
    }

    public CompletableFuture<StatusCode> setComment(LocalizedText value) {
        return setProperty(AuditConditionConfirmEventType.COMMENT, value);
    }
}
