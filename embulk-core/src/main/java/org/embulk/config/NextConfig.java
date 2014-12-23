package org.embulk.config;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class NextConfig
        extends DataSource<NextConfig>
{
    public NextConfig(ModelManager model)
    {
        super(model);
    }

    // visible for DataSourceSerDe
    NextConfig(ModelManager model, ObjectNode data)
    {
        super(model, data);
    }

    @Override
    protected NextConfig newInstance(ModelManager model, ObjectNode data)
    {
        return new NextConfig(model, data);
    }
}
