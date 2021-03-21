export default function getAllQuotationByClientId (req, res){
    res.json({byId: req.query.id, message: 'getAllQuotationByClientId'})
}