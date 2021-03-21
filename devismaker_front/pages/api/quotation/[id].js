export default function getAllDevisById (req, res){
    res.json({byId: req.query.id, message: 'getAllDevisById'})
}