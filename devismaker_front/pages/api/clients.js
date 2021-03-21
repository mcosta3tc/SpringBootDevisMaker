export default async function getAllDevisInfo (req, res){
    const devis = await fetch('http://localhost:8080/api/devis');
    const json = await devis.json();
    res.json(json)
}