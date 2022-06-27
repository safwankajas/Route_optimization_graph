const gremlin = require('gremlin');
const __ = gremlin.process.statics;
const traversal = gremlin.process.AnonymousTraversalSource.traversal;
const DriverRemoteConnection = gremlin.driver.DriverRemoteConnection;
const g = traversal().withRemote(new DriverRemoteConnection('ws://localhost:8182/gremlin'));
module.exports.g=g;
module.exports.processStastics=__;
