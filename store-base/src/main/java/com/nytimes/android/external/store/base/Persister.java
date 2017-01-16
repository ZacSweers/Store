package com.nytimes.android.external.store.base;

import android.support.annotation.NonNull;

import rx.Observable;

/**
 * Interface for fetching data from persister
 *
 * @param <Raw> data type before parsing
 */
public interface Persister<Raw> {

    /**
     * @param barCode to use to get data from persister
     *                If data is not available implementer needs to
     *                either return Observable.empty or throw an exception
     */
    @NonNull
    Observable<Raw> read(final BaseBarcode barCode);

    /**
     * @param barCode to use to store data to persister
     * @param raw     raw string to be stored
     */
    @NonNull
    Observable<Boolean> write(final BaseBarcode barCode, final Raw raw);
}
