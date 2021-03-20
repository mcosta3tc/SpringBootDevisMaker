import * as React from "react";
import NextHead from "next/head"

class Layout extends React.Component {

    constructor(props, context) {
        super(props, context);
    }

    render() {
        return (
            <>
                <NextHead>
                    <title>{this.props.title} - Products</title>
                    <meta name="viewport" content="initial-scale=1.0, width=device-width"/>
                </NextHead>

                <header>
                    <div className="header-container">
                        <p className="header-container-title">Devis Maker</p>
                    </div>
                    this is a header
                </header>

                {this.props.children}

                <footer>
                    this is a footer
                </footer>
            </>
        )
    }
}

export default Layout;