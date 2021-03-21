export default function getClientById (req, res){
    res.json({byId: req.query.id, message: 'getClientById'})
}