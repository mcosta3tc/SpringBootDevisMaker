import until from '../utils/until'
import * as React from "react";
import Link from "next/link";
import Layout from "../components/Layout";
import {useEffect, useState} from "react/cjs/react.production.min";
import axios from "axios";

const Index = () => {

    return (
        <Layout>

        </Layout>
    )
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
