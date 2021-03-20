import until from '../utils/until'
import * as React from "react";
import Link from "next/link";
import Layout from "../components/Layout";


class Index extends React.Component {

    static async getInitialProps(ctx) {
        const res = await fetch('http://localhost:9090/products/')
        const json = await res.json()
        return {products: json}
    }

    render() {
        return (
            <Layout>
                <div>
                    {this.props.products.map(product => <div>{product.nom}</div>)}
                </div>
            </Layout>

        );
    }

    constructor(props) {
        super(props);
    }
}

export default Index

/*
export async function getServerSideProps(context) {
    const [response, err] = await until(axios.get('http://localhost:9090/products/'))

    if (err !== null) {
        console.log('An error occurred')
        return {
            props: {
                isSuccess: false,
                response: null
            }
        }
    }

    return {
        props: {
            isSuccess: true,
            response: response
        }
    }
}*/
