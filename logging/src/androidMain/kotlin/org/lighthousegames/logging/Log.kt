package org.lighthousegames.logging

class Log {

    companion object {

        @JvmStatic
        @JvmOverloads
        fun v(tag: String?, msg: String, t: Throwable? = null) {
            if (KmLogging.isLoggingVerbose)
                KmLogging.verbose(tag.toString(), msg)
        }

        @JvmStatic
        @JvmOverloads
        fun d(tag: String?, msg: String, t: Throwable? = null) {
            if (KmLogging.isLoggingDebug)
                KmLogging.debug(tag.toString(), msg)
        }

        @JvmStatic
        @JvmOverloads
        fun i(tag: String?, msg: String, t: Throwable? = null) {
            if (KmLogging.isLoggingInfo)
                KmLogging.info(tag.toString(), msg)
        }

        @JvmStatic
        @JvmOverloads
        fun w(tag: String?, msg: String, t: Throwable? = null) {
            if (KmLogging.isLoggingWarning)
                KmLogging.warn(tag.toString(), msg, t)
        }

        @JvmStatic
        @JvmOverloads
        fun e(tag: String?, msg: String, t: Throwable? = null) {
            if (KmLogging.isLoggingError)
                KmLogging.error(tag.toString(), msg, t)
        }
    }
}