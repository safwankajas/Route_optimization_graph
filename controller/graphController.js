const res = require('express/lib/response');
const { g } = require("../connection/connection");
const Model = require('../model/Model')
const __ = require('../connection/connection').processStastics
exports.getGraph_data = async (req, res) => {
    const data = await Model.getData()
    var json_data = array_map_to_json(data)
    var hg = []
    for (let index = 0; index < json_data.length; index++) {
        var path_way = {
            ...await edge_traversal_count(json_data[index]),
            ...await edge_traversal_count1(json_data[index]),
            ...await edge_traversal_count2(json_data[index]),
            ...await edge_traversal_count3(json_data[index])
        }
        console.log(path_way);
    }

    // df = Object.values(path_way)
    // max = Math.max(...df);
    // console.log(getKeyByValue(path_way, max));
    res.json(path_way)
}
exports.updateGraph_count = async (req, res) => {
    let place=new Model(req.body.place,req.body.count)
    console.log(await place.getData_one());
    res.json("count updated successfully")
   
}
exports.get_data_by_place = async (req, res) => {
    let data=await Model.getData_simple(req.params.place)
    let data1=map_to_json(data.value)
    res.json(data1)
   
}
exports.all = async (req, res) => {
    let data=await Model.get_all_Data()
    res.json(array_map_to_json(data))
   
}
exports.get_bus_one = async (req, res) => {
    let data=await Model.getData_bus()
    res.json(map_to_json(data.value))
   
}
exports.update_bus_one = async (req, res) => {
    let data=new Model('bus',req.body.count)
    console.log(await data.update_count());
    res.json('bus count update successfully')
   
}
function getKeyByValue(object, value) {
    return Object.keys(object).find(key => object[key] === value);
}
async function edge_traversal_count({ id }) {
    var data = []
    data.push(await g.V().hasId(id).values('place').toList())
    data.push(await g.V().hasId(id).inE('way').outV().values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way').outV()).times(2).values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way').outV()).times(3).values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way').outV()).times(4).values('place').toList())
    let array = data
    var data1 = []
    data1.push(await g.V().hasId(id).values('count').toList())
    data1.push(await g.V().hasId(id).inE('way').outV().values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way').outV()).times(2).values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way').outV()).times(3).values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way').outV()).times(4).values('count').toList())
    let array1 = data1
    kl = {}
    for (let index = 0; index < array[0].length; index++) {
        kl[array[0][index] + '=>' + array[1][index] + '=>' + array[2][index] + '=>' + array[3][index]
            + '=>' + array[4][index]] = array1[0][index] + array1[1][index] + array1[2][index] + array1[3][index] + array1[4][index]

    }
    return kl
}
async function edge_traversal_count1({ id }) {
    var data = []
    data.push(await g.V().hasId(id).values('place').toList())
    data.push(await g.V().hasId(id).inE('way1').outV().values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way1').outV()).times(2).values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way1').outV()).times(3).values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way1').outV()).times(4).values('place').toList())
    let array = data
    var data1 = []
    data1.push(await g.V().hasId(id).values('count').toList())
    data1.push(await g.V().hasId(id).inE('way1').outV().values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way1').outV()).times(2).values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way1').outV()).times(3).values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way1').outV()).times(4).values('count').toList())
    let array1 = data1
    kl = {}
    for (let index = 0; index < array[0].length; index++) {
        kl[array[0][index] + '=>' + array[1][index] + '=>' + array[2][index] + '=>' + array[3][index]
            + '=>' + array[4][index]] = array1[0][index] + array1[1][index] + array1[2][index] + array1[3][index] + array1[4][index]

    }
    return kl
}

async function edge_traversal_count2({ id }) {
    var data = []
    data.push(await g.V().hasId(id).values('place').toList())
    data.push(await g.V().hasId(id).inE('way2').outV().values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way2').outV()).times(2).values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way2').outV()).times(3).values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way2').outV()).times(4).values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way2').outV()).times(5).values('place').toList())

    let array = data
    var data1 = []
    data1.push(await g.V().hasId(id).values('count').toList())
    data1.push(await g.V().hasId(id).inE('way2').outV().values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way2').outV()).times(2).values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way2').outV()).times(3).values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way2').outV()).times(4).values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way2').outV()).times(5).values('count').toList())
    let array1 = data1
    kl = {}
    for (let index = 0; index < array[0].length; index++) {
        kl[array[0][index] + '=>' + array[1][index] + '=>' + array[2][index] + '=>' + array[3][index]
            + '=>' + array[4][index] + '=>' + array[5][index]] = array1[0][index] + array1[1][index] + array1[2][index] + array1[3][index] + array1[4][index] + array1[5][index]

    }
    return kl
}

async function edge_traversal_count3({ id }) {
    var data = []
    data.push(await g.V().hasId(id).values('place').toList())
    data.push(await g.V().hasId(id).inE('way3').outV().values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way3').outV()).times(2).values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way3').outV()).times(3).values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way3').outV()).times(4).values('place').toList())
    data.push(await g.V().hasId(id).repeat(__.inE('way3').outV()).times(5).values('place').toList())

    let array = data
    var data1 = []
    data1.push(await g.V().hasId(id).values('count').toList())
    data1.push(await g.V().hasId(id).inE('way3').outV().values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way3').outV()).times(2).values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way3').outV()).times(3).values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way3').outV()).times(4).values('count').toList())
    data1.push(await g.V().hasId(id).repeat(__.inE('way3').outV()).times(5).values('count').toList())
    let array1 = data1
    kl = {}
    for (let index = 0; index < array[0].length; index++) {
        kl[array[0][index] + '=>' + array[1][index] + '=>' + array[2][index] + '=>' + array[3][index]
            + '=>' + array[4][index] + '=>' + array[5][index]] = array1[0][index] + array1[1][index] + array1[2][index] + array1[3][index] + array1[4][index] + array1[5][index]

    }
    return kl
}



let map_to_json = (map) => {
    if (map != null) {
        obj = {};
        i = 0
        map.forEach((value, key) => {
            if (i < 2) {
                obj[key] = value

            }
            else {
                obj[key] = value[0]

            }
            i++
        });
        return obj
    }
}
array_map_to_json = (array_map) => {
    let array_object = array_map.map(item => {
        return map_to_json(item)
    })
    return array_object
}