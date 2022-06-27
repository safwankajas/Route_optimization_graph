const router = require('express').Router();
const graphController=require('../controller/graphController')
router.route('/')
      .get(graphController.getGraph_data)
      .post(graphController.updateGraph_count)
router.route('/data/:place')
      .get(graphController.get_data_by_place)
router.route('/all')
      .get(graphController.all)
router.route('/bus')
      .get(graphController.get_bus_one)
      .post(graphController.update_bus_one)
module.exports = router;
