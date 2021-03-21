export default async function getAllDevisInfo (req, res){
    const devis = await fetch('http://localhost:9090/devis/get');
    const json = await devis.json();
    res.json(json)
}