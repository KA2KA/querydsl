/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.jdoql;

import javax.jdo.PersistenceManager;

import com.mysema.query.DefaultQueryMetadata;


/**
 * Default implementation of the JDOQLQuery interface
 * 
 * @author tiwe
 * 
 * @param <A>
 */
public class JDOQLQueryImpl extends AbstractJDOQLQuery<JDOQLQueryImpl> implements JDOQLQuery{

    public JDOQLQueryImpl(PersistenceManager pm, JDOQLTemplates templates) {
        super(pm, templates);
    }

    public JDOQLQueryImpl(PersistenceManager pm) {
        super(pm, JDOQLTemplates.DEFAULT);
    }
}
