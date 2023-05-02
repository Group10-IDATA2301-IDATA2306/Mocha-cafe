export function ContactInformation() {
    return (
        <div className="formWrapper">
            <h2 className="formHeader">
                Contact information
            </h2>
            <input type="text" placeholder="Email" className="formInput" />
            <input type="text" placeholder="Phone number" className="formInput"/>
        </div>
    )
}