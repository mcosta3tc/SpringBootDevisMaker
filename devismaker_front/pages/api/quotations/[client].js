export default async function getQuotationByClient(req, res) {
    console.log(req)
    const devis = await fetch(`http://localhost:8080/api/devis/${req.query.client}`);
    const json = await devis.json();
    res.json(json)
}
