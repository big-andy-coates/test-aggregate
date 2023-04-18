import io.github.big.andy.coates.test.aggregate.api.TestAggregateAggregateDescriptor;
import org.creekservice.api.platform.metadata.ComponentDescriptor;

module test.aggregate.api {
    requires transitive creek.kafka.metadata;

    exports io.github.big.andy.coates.test.aggregate.api;
    exports io.github.big.andy.coates.test.aggregate.internal to
            test.aggregate.services;

    provides ComponentDescriptor with
            TestAggregateAggregateDescriptor;
}
