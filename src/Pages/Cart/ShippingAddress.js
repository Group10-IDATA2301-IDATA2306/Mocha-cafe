export function ShippingAddress() {
    return (
        <div classNameName="formWrapper">
            <h2 classNameName="formHeader">
                Shipping address
            </h2>
            <div className="formInputWrapper">
                <input type="text" placeholder="First name" className="formInput" />
                <input type="text" placeholder="Last name" className="formInput" />
            </div>
            <input type="text" placeholder="Company (Required for business addresses)" className="formInput" />
            <input type="text" placeholder="Address" className="formInput" />
            <div className="formInputWrapper">
                <select name="country" id="countryDropDown" className="formInput">
                    <option value="Norway" className="formOption">Norway</option>
                    <option value="Sweden" className="formOption">Sweden</option>
                </select>
                <input type="text" placeholder="City" className="formInput" />
                <input type="text" placeholder="ZIP code" className="formInput" />
            </div>
        </div>
    )
}